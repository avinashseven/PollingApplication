package com.example.polling.model;

public abstract class RoleName implements Comparable {

    //public static int expectedMethod() {

        private String studentname;
        private int rollno;
        private int studentage;

    public RoleName( int rollno, String studentname,int studentage){
            this.rollno = rollno;
            this.studentname = studentname;
            this.studentage = studentage;
        }

        public String getStudentname () {
            return studentname;
        }

        public void setStudentname (String studentname){
            this.studentname = studentname;
        }

        public int getRollno () {
            return rollno;
        }

        public void setRollno ( int rollno){
            this.rollno = rollno;
        }

        public int getStudentage () {
            return studentage;
        }

        public void setStudentage ( int studentage){
            this.studentage = studentage;
        }

        //@Override
        public int compareTo (RoleName comparestu){
            int compareage = ((RoleName) comparestu).getStudentage();
            /* For Ascending order*/
            return this.studentage - compareage;

            /* For Descending order do like this */
            //return compareage-this.studentage;
        }

        }

//        @Override
//        public String toString () {
//            return "[ This Roll No =" + this.rollno + ", name=" + this.studentname + ", age=" + this.studentage + "]";
//        }


