package lec.vertexInfo;

public class VNormal extends Vertex3d {

	public VNormal(float x, float y, float z) {
		super(x, y, z);
		// TODO Auto-generated constructor stub
	}
	
	public VNormal(VNormal v){
		super(v);
	}

	@Override
	public String toString() {
		return "VNormal [getX()=" + getX() + ", getY()=" + getY() + ", getZ()="
				+ getZ() + "]";
	}
	
	
	
}
