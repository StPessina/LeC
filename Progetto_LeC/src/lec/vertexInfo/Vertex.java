package lec.vertexInfo;

public class Vertex extends Vertex3d {

	public Vertex(float x, float y, float z) {
		super(x, y, z);
		// TODO Auto-generated constructor stub
	}
	
	public Vertex(Vertex v){
		super(v);
	}

	@Override
	public String toString() {
		return "Vertex [getX()=" + getX() + ", getY()=" + getY() + ", getZ()="
				+ getZ() + "]";
	}
	
	
}
