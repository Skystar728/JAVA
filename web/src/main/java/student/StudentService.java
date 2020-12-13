package student;

import java.util.List;
public interface StudentService {
	void student_insert(StudentVO vo);
	List<StudentVO> student_list();
	StudentVO student_detail(int id);
	void student_update(StudentVO vo);
	void student_delete(int id);
}
