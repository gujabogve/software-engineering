package univeristy.model;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String nickName;
    private String fullName;
    private List<Faculty> facultyList = new ArrayList<>();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(fullName).append(" (").append(nickName).append(")");
        sb.append("\n");
        for (Faculty f: facultyList) {
            sb.append(f);
            sb.append("\n");
        }
        return sb.toString();
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public List<Faculty> getFacultyList() {
        return facultyList;
    }

    public void setFacultyList(List<Faculty> facultyList) {
        this.facultyList = facultyList;
    }
}
