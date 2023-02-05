package com.schmitt.schmittfinalexam;

public class StudentModel
{
    private int studentID;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private int projectScore;
    private int[] examScores;
    private int[] assignmentScores;
    
    //<editor-fold> Getters
    protected int getStudentID() { return studentID; }
    protected String getFirstName() { return firstName; }
    protected String getLastName() { return lastName; }
    protected String getEmailAddress() { return emailAddress; }
    protected int getProjectScore() { return projectScore; }
    protected int[] getExamScores() { return examScores; }
    protected int[] getAssignmentScores() { return assignmentScores; }
    //</editor-fold> Getters

    //<editor-fold> Setters
    public void setStudentID(int studentID) { this.studentID = studentID; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setEmailAddress(String emailAddress) { this.emailAddress = emailAddress; }
    public void setProjectScore(int projectScore) { this.projectScore = projectScore; }
    public void setExamScores(int[] examScores) { this.examScores = examScores; }
    public void setAssignmentScores(int[] assignmentScores) { this.assignmentScores = assignmentScores; }
    //</editor-fold>
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(studentID).append("\t\t");
        sb.append(firstName).append("\t\t");
        sb.append(lastName).append("\t\t");
        sb.append(emailAddress).append("\t\t");
        return sb.toString();
    }
}