public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("UE1000" + i,
                    switch (i) {
                        case 1 -> "Kay";
                        case 2 -> "Tod";
                        case 3 -> "Jay";
                        case 4 -> "Dey";
                        case 5 -> "Lay";
                        default -> "Unknown";
                    },
                    "22/05/1995",
                    "CLASS 1");
            System.out.println(s);
        }
        Student pojoStudent = new Student("UE2000", "Temi",
                "22/05/1995", "Java Masterclass");

        LPAStudent recordStudent = new LPAStudent("UE3000", "Tom",
                "15/11/1995", "Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
//        recordStudent.setClassList(recordStudent.classList()+ ", Java OCP Exam 829");

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());

    }
}