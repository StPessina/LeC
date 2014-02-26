package lec.vertexInfo;

public class Vertex3d<T extends Vertex3d> implements Comparable<T>{
	protected float x;
	protected float y;
	protected float z;
	
	public Vertex3d(Vertex3d v) {
		this.copy(v);
	}
	
	public Vertex3d(float x, float y, float z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public float getZ() {
		return z;
	}
	public void setZ(float z) {
		this.z = z;
	}
	
	public void copy(Vertex3d v){
		this.x = v.x;
		this.y = v.y;
		this.z = v.z;
	}

	@Override
	public int compareTo(T o) {
		if(x==o.x && y==o.y && z==o.z)
			return 0;
		return -1;
	}
	
	public String getDef(){
		return null;
	}
	
	public String getKey() {
		return "ciao";
	}
}
