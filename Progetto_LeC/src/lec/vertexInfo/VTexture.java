package lec.vertexInfo;

public class VTexture extends Vertex3d {

	public VTexture(float x, float y, float z) {
		super(x, y, z);
		// TODO Auto-generated constructor stub
	}
	
	public VTexture(VTexture v){
		super(v);
	}

	@Override
	public String toString() {
		return "VTexture [getX()=" + getX() + ", getY()=" + getY()
				+ ", getZ()=" + getZ() + "]";
	}
	
	

}
