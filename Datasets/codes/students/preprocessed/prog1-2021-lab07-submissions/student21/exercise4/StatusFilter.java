public class StatusFilter {
    public boolean lecturerFilter(boolean teacher) {
        boolean lecturer = false;
        if (teacher == true) {
            lecturer = true;
        }
        return lecturer;
    }

    public boolean studentFilter(boolean studies) {
        boolean student = false;
        if (studies == true) {
            student = true;
        }
        return student;
    }

    public boolean taFilter(boolean studies, boolean teacher) {
        boolean ta = false;
        if (studies == true) {
            if (teacher == true) {
                ta = true;
            }
        }
        return ta;
    }
}
