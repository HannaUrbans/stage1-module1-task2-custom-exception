package com.epam.mjc;

public class StudentManager {
    private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public Student find(long studentID) throws StudentIsNotFoundByIdException {
        try{Student.getValueOf(studentID);}
        catch(IllegalArgumentException ex){
            throw new StudentIsNotFoundByIdException("Could not find student with ID " + studentID, ex);
        }

        return Student.getValueOf(studentID);
    }
    public static void main(String[] args) throws StudentIsNotFoundByIdException {
        StudentManager manager = new StudentManager();
        try{manager.find(-44);
            for (int i = 0; i < IDs.length; i++) {
                Student student = manager.find(IDs[i]);
                System.out.println("Student name " + student.getName());
            }}

        catch (StudentIsNotFoundByIdException ex) {

            System.err.print(ex);
        }
        }
}


//create your custom exception which is inherited IllegalArgumentException.
// custom exception should be return custom message like "Could not find student with ID {id}".
//Implement method 'find' in class StudentManager which are throw your custom exception if this student is not found.
//catch(IllegalArgumentException ex){for (int k = 0; k < IDs.length; k++)
//        { if (IDs[k] != studentID) {
//           throw new StudentIsNotFoundByIdException("Could not find student with ID " + studentID, ex);
//        }}