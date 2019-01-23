class TutorialGroup {
    private String _groupNum;
    private String[] _students;

    public TutorialGroup(String groupNum) {
        _groupNum = groupNum;
        _students = new String[8];
        for (int i = 0; i < _students.length; i++) {
            _students[i] = "";
        }
    }
    public String getGroupNum() {
        System.out.println(_groupNum);
        return null;
    }
    public String getStudentAt(int sNo) {
        return _students[sNo - 1];
    }
    public void addStudent(String student) {
        _students[_students.length - 1] = student;
    }
    public void setStudentAt(int sNo, String newStudent) {
        if (sNo <= _students.length) {
            _students[sNo - 1] = newStudent;
        } else {
            String[] newList = new String[sNo];
            for (int i = 0; i < sNo; i++) {
                if (i < _students.length) {
                    newList[i] = _students[i];
                } else if (i + 1 == sNo) {
                    newList[i] = newStudent;
                } else {
                    newList[i] = "";
                }
            }
            _students = newList;
        }
    }
    public void shrinkClassSize(int newSize) {
        String[] temp = _students;
        String[] newClass = new String[newSize];
        for (int i = 0; i < newSize; i++) {
            newClass[i] = temp[i];
        }
        _students = newClass;
    }
    public String toString() {
        System.out.print("[");
        for (int i = 0; i < _students.length; i++) {
            if (i + 1 == _students.length) {
                System.out.print((i + 1) + ":" + _students[i]);
            } else {
                System.out.print((i + 1) + ":" + _students[i] + ", ");
            }
        }
        System.out.print("]");
        return null;
    }
}

class Tutorials {
    public static void main(String[] args) {
        TutorialGroup T05 = new TutorialGroup("T05");
        runTest(T05);
    }
    public static void runTest(TutorialGroup group) {
        group.setStudentAt(1, "Ridi");
        group.setStudentAt(2, "Van");
        group.setStudentAt(3, "Abdul");
        group.setStudentAt(4, "Samuel");
        group.setStudentAt(6, "Ian");

        System.out.println(group.getStudentAt(4));
        System.out.println(group.getStudentAt(8));
        group.addStudent("Shiya");
        group.setStudentAt(6, "Ivan");
        group.setStudentAt(7, "Ranald");
        group.setStudentAt(11, "Weiliang");
        group.getGroupNum();
        group.toString();
    }
}
