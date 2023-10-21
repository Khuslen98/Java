public class Main {

    public static void main(String[] args){
        for(int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("23090" + i,
                    switch (i) {
                case 1 -> "Khuslen";
                case 2 -> "ABBA";
                case 3 -> "Gabba";
                case 4 -> "Jajaj";
                case 5 -> "Kaka";
                        default -> "Anonymous";
                    },
                    switch (i){
                case 1 -> "09/19/1997";
                case 2 -> "09/19/1996";
                case 3 -> "09/19/1995";
                case 4 -> "09/19/1994";
                case 5 -> "09/19/1993";
                        default -> "Anonymous";
                    }
                    ,
                    "Java Masterclass");
            System.out.println(s);
        }

        Student pojoStudent = new Student( "S923006", "ANN", "05/11/1993", "Pastry MasterClass");
        LPAStudent recordStudent = new LPAStudent("S923007", "ANNa", "05/11/1900", "French chef MasterClass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
//        recordStudent.setClassList(recordStudent.classList() + ", Java OCP Exam 819");

        System.out.println(pojoStudent.getName() + " is Taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is Taking " + recordStudent.classList());

    }
}
