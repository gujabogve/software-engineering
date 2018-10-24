package interfacetest;

import java.util.ArrayList;
import java.util.List;

public class Triangle extends Shape {
    public void setVertexes(Vertex a, Vertex b, Vertex c) {
        List<Vertex> v = new ArrayList<Vertex>();
        v.add(a);
        v.add(b);
        v.add(c);
        setVertexes(v);
    }
}
