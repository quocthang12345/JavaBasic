package control;

import modal.StudentRegister;

import java.util.ArrayList;

public class UtilityControl {
    public static ArrayList<StudentRegister> UpdateSR(ArrayList<StudentRegister> list , StudentRegister studentRegister)
    {
        boolean IsUpdate = false;
        for (int i = 0; i < list.size() ; i++) {
            StudentRegister s = list.get(i);
            if (s.getStudent().getStudentID() == studentRegister.getStudent().getStudentID() &&
            s.getSubject().getSubjectID() == studentRegister.getSubject().getSubjectID()) {
                list.set(i, studentRegister);
                IsUpdate = true;
                break;
            }
        }
        if(!IsUpdate) list.add(studentRegister);
        return list;
    }
}
