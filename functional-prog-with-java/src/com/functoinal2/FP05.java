package com.functoinal2;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Course{
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;
	
	
	public Course(String name, String category, int reviewScore, int noOfStudents) {
		super();
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudents = noOfStudents;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getReviewScore() {
		return reviewScore;
	}
	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}
	public int getNoOfStudents() {
		return noOfStudents;
	}
	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}
//	@Override
//	public String toString() {
//		return "Course [name=" + name + ", category=" + category + ", reviewScore=" + reviewScore + ", noOfStudents="
//				+ noOfStudents + "]";
//	}
	
	@Override
	public String toString() {
		return "Course [name=" + name + ", noOfStudents=" + noOfStudents + ", reviewScore=" + reviewScore + "]";
	}
}
public class FP05 {
		@SuppressWarnings({ "unused", "unchecked" })
		public static void main(String[] args) {
			
			List<Course> courses =	List.of(
					new Course("Spring", "Framework", 98, 20000),
					new Course("Spring Boot", "Framework", 95, 18000),
					new Course("API", "Microservices", 97, 22000),
					new Course("Microservices", "Microservices", 96, 25000),
					new Course("FullStack", "FullStack", 91, 14000),
					new Course("AWS", "Cloud", 92, 21000),
					new Course("Azure", "Cloud", 99, 21000),
					new Course("Docker", "Cloud", 92, 20000),
					new Course("Kubernetes", "Cloud", 91, 20000)
					);
			
			//allMatch, noneMatch, anyMatch
			Predicate<Course> reviewScoreGreaterThan95Predicate =
							course -> course.getReviewScore() >95;
			Predicate<Course> reviewScoreGreaterThan90Predicate =
							course -> course.getReviewScore() >90;
			Predicate<Course> reviewScoreLessThan90Predicate =
							course -> course.getReviewScore() <90;
			System.out.println(courses.stream().allMatch(reviewScoreGreaterThan95Predicate));
			
			System.out.println(courses.stream().noneMatch(reviewScoreLessThan90Predicate));
			
			System.out.println(courses.stream().anyMatch(reviewScoreLessThan90Predicate));
			
			System.out.println(courses.stream().anyMatch(reviewScoreGreaterThan95Predicate));

			//sorting courses with sorted and creating Comparators
			
			Comparator comparingByNoOfStudentsIncreasing = 
					Comparator.comparing(Course::getNoOfStudents);

			System.out.println(courses.stream().sorted(comparingByNoOfStudentsIncreasing).collect(Collectors.toList()));
			//[Course [name=FullStack, category=FullStack, reviewScore=91, noOfStudents=14000], Course [name=Spring Boot, category=Framework, reviewScore=95, noOfStudents=18000], Course [name=Spring, category=Framework, reviewScore=98, noOfStudents=20000], Course [name=Docker, category=Cloud, reviewScore=92, noOfStudents=20000], Course [name=Kubernetes, category=Cloud, reviewScore=91, noOfStudents=20000], Course [name=AWS, category=Cloud, reviewScore=92, noOfStudents=21000], Course [name=Azure, category=Cloud, reviewScore=99, noOfStudents=21000], Course [name=API, category=Microservices, reviewScore=97, noOfStudents=22000], Course [name=Microservices, category=Microservices, reviewScore=96, noOfStudents=25000]]

			Comparator comparingByNoOfStudentsDecreasing = 
					Comparator.comparing(Course::getNoOfStudents).reversed();

			System.out.println(courses.stream().sorted(comparingByNoOfStudentsDecreasing).collect(Collectors.toList()));
			//[Course [name=Microservices, category=Microservices, reviewScore=96, noOfStudents=25000], Course [name=API, category=Microservices, reviewScore=97, noOfStudents=22000], Course [name=AWS, category=Cloud, reviewScore=92, noOfStudents=21000], Course [name=Azure, category=Cloud, reviewScore=99, noOfStudents=21000], Course [name=Spring, category=Framework, reviewScore=98, noOfStudents=20000], Course [name=Docker, category=Cloud, reviewScore=92, noOfStudents=20000], Course [name=Kubernetes, category=Cloud, reviewScore=91, noOfStudents=20000], Course [name=Spring Boot, category=Framework, reviewScore=95, noOfStudents=18000], Course [name=FullStack, category=FullStack, reviewScore=91, noOfStudents=14000]]

			Comparator comparingByNoOfStudentsAndNoOfReviews = 
					Comparator.comparing(Course::getNoOfStudents)
//					Comparator.comparingInt(Course::getNoOfStudents)//whenever you are doing primitives, you can use comparingInt, comparingDouble
					.thenComparing(Course::getReviewScore)
//					.thenComparingInt(Course::getReviewScore)//Even the thenComparing offers doubleInt and long method
					.reversed();
			
			System.out.println(courses.stream().sorted(comparingByNoOfStudentsAndNoOfReviews).collect(Collectors.toList()));
			//[Course [name=Microservices, category=Microservices, reviewScore=96, noOfStudents=25000], Course [name=API, category=Microservices, reviewScore=97, noOfStudents=22000], Course [name=Azure, category=Cloud, reviewScore=99, noOfStudents=21000], Course [name=AWS, category=Cloud, reviewScore=92, noOfStudents=21000], Course [name=Spring, category=Framework, reviewScore=98, noOfStudents=20000], Course [name=Docker, category=Cloud, reviewScore=92, noOfStudents=20000], Course [name=Kubernetes, category=Cloud, reviewScore=91, noOfStudents=20000], Course [name=Spring Boot, category=Framework, reviewScore=95, noOfStudents=18000], Course [name=FullStack, category=FullStack, reviewScore=91, noOfStudents=14000]]

			//skip, limit, takeWhile and dropWhile
			
			System.out.println(courses.stream()
					.sorted(comparingByNoOfStudentsAndNoOfReviews)
					.limit(5)// want to prints upto 5 elements in the list
					.collect(Collectors.toList()));

			System.out.println(courses.stream()
					.sorted(comparingByNoOfStudentsAndNoOfReviews)
					.skip(3)// want to skip top 3 result in the list
					.collect(Collectors.toList()));
			
			System.out.println(courses.stream()
					.sorted(comparingByNoOfStudentsAndNoOfReviews)
					.skip(3)//will skip 3 elements from the list
					.limit(5)//will print next 5 elements
					.collect(Collectors.toList()));
			
			System.out.println(courses);
			
			System.out.println(courses.stream()
				.takeWhile(course -> course.getReviewScore() >=95)//will retrun elements just before it finds less than 95 in the list 
				.collect(Collectors.toList()));
			
			System.out.println(courses.stream()
					.dropWhile(course -> course.getReviewScore() >=95)//will retrun elements just before it finds less than 95 in the list 
					.collect(Collectors.toList()));
			
			// max , min , findFirst, findAny
			System.out.println(
					courses.stream()
					.max(comparingByNoOfStudentsAndNoOfReviews));//return last element in the list
			//Optional[Course [name=FullStack, noOfStudents=14000, reviewScore=91]]
			
			System.out.println(
					courses.stream()
					.min(comparingByNoOfStudentsAndNoOfReviews));//return first element in the list
			//Optional[Course [name=Microservices, noOfStudents=25000, reviewScore=96]]

			System.out.println(
					courses.stream()
					.filter(reviewScoreLessThan90Predicate)
					.min(comparingByNoOfStudentsAndNoOfReviews)
					.orElse(new Course("Kubernetes", "Cloud", 91, 20000))//if doesn't find any value then return this default
					);
			//Optional.empty
			//Course [name=Kubernetes, noOfStudents=20000, reviewScore=91]

			System.out.println(
					courses.stream()
							.filter(reviewScoreLessThan90Predicate)
							.findFirst()//it return an Optional back
					);
			//Optional.empty

			System.out.println(
					courses.stream()
							.filter(reviewScoreGreaterThan95Predicate)
							.findFirst()//it return an Optional back
					);
			//Optional[Course [name=Spring, noOfStudents=20000, reviewScore=98]]

			System.out.println(
					courses.stream()
							.filter(reviewScoreGreaterThan95Predicate)
							.findAny()//findAny actually returns any of the values, any of the elements from the stream which match this criteria
					);
			//Optional[Course [name=Spring, noOfStudents=20000, reviewScore=98]]

			
			//sum , average, count
			System.out.println(
					courses.stream()
							.filter(reviewScoreGreaterThan95Predicate)
							.mapToInt(Course::getNoOfStudents)
							.sum());
			//88000
			System.out.println(
					courses.stream()
							.filter(reviewScoreGreaterThan95Predicate)
//							.map(course -> course.getNoOfStudents())
							.mapToInt(Course::getNoOfStudents)
							.average());
			//OptionalDouble[22000.0]

			System.out.println(
					courses.stream()
							.filter(reviewScoreGreaterThan95Predicate)
							.mapToInt(Course::getNoOfStudents)
							.count());
			//4
			System.out.println(
					courses.stream()
							.filter(reviewScoreGreaterThan95Predicate)
							.mapToInt(Course::getNoOfStudents)
							.max());
			//OptionalInt[25000]

			//Map using groupingBy
				System.out.println(courses.stream()
						.collect(Collectors.groupingBy(Course::getCategory)));
			//{Cloud=[Course [name=AWS, noOfStudents=21000, reviewScore=92], Course [name=Azure, noOfStudents=21000, reviewScore=99], Course [name=Docker, noOfStudents=20000, reviewScore=92], Course [name=Kubernetes, noOfStudents=20000, reviewScore=91]],
			//FullStack=[Course [name=FullStack, noOfStudents=14000, reviewScore=91]],
			//Microservices=[Course [name=API, noOfStudents=22000, reviewScore=97], Course [name=Microservices, noOfStudents=25000, reviewScore=96]], 
			//Framework=[Course [name=Spring, noOfStudents=20000, reviewScore=98], Course [name=Spring Boot, noOfStudents=18000, reviewScore=95]]}

			System.out.println(courses.stream()
					.collect(Collectors.groupingBy(Course::getCategory, Collectors.counting())));
			//{Cloud=4, FullStack=1, Microservices=2, Framework=2}

			System.out.println(courses.stream()
					.collect(Collectors.groupingBy(Course::getCategory, Collectors.maxBy(Comparator.comparing(Course::getReviewScore)))));
			//{Cloud=Optional[Course [name=Azure, noOfStudents=21000, reviewScore=99]], FullStack=Optional[Course [name=FullStack, noOfStudents=14000, reviewScore=91]], Microservices=Optional[Course [name=API, noOfStudents=22000, reviewScore=97]], Framework=Optional[Course [name=Spring, noOfStudents=20000, reviewScore=98]]}

			System.out.println(courses.stream()
					.collect(Collectors.groupingBy(Course::getCategory, Collectors.mapping(Course::getName, Collectors.toList()))));
		//{Cloud=[AWS, Azure, Docker, Kubernetes], FullStack=[FullStack], Microservices=[API, Microservices], Framework=[Spring, Spring Boot]}

			/**
			 * starts from here
			 */
			
			Predicate<Course> reviewScoreGreaterThan95Predicate2 =
					createPredicagteWithCutOffReviewScore(95) ;
			Predicate<Course> reviewScoreGreaterThan90Predicate2 =
//					course -> course.getReviewScore() >90;
					createPredicagteWithCutOffReviewScore(90) ;
			
		}
			//Higher order function: A higher order function returns another function as the return value.
		private static Predicate<Course> createPredicagteWithCutOffReviewScore(int cutOffReviewScore) {
			return course -> course.getReviewScore() > cutOffReviewScore;
		}
	}
