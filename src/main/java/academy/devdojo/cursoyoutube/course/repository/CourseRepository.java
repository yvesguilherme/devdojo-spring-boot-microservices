package academy.devdojo.cursoyoutube.course.repository;

import academy.devdojo.cursoyoutube.course.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {
}
