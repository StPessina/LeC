package lec.graphelement;

import java.util.ArrayList;

import lec.vertexInfo.VNormal;
import lec.vertexInfo.VTexture;
import lec.vertexInfo.Vertex;

public class Point extends GraphElement {
	Vertex v;

	public Point(){
	
	}
		
	public Point(Vertex v) {
		super();
		this.v = new Vertex(v);
	}
	
	public Point(Point p) {
		this.v = new Vertex(p.v);
	}

	public Vertex getV() {
		return v;
	}

	public void setV(Vertex v) {
		this.v = v;
	}

	@Override
	public String toString() {
		return "Point [v=" + v + "]";
	}

	@Override
	public ArrayList<Vertex> getOBJVertices() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<VTexture> getOBJVTexture() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<VNormal> getOBJVNormal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNumberOfVertices() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getNumberOfVTexture() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getNumberOfVNormal() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
}
