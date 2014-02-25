package lec.graphelement;

import java.util.ArrayList;

import lec.exception.LineNotHomogeneityException;
import lec.vertexInfo.VNormal;
import lec.vertexInfo.VTexture;
import lec.vertexInfo.Vertex;

public class Line extends GraphElement {
	
	boolean withTexture = false;
	
	private class LineVertexInfo {
		Vertex vertex;
		VTexture vTexture;
		
		public LineVertexInfo(Vertex v, VTexture vt) {
			vertex = new Vertex(v);
			vTexture = new VTexture(vt);
		}
		
		public LineVertexInfo(Vertex v) {
			vertex = new Vertex(v);
		}
		
		
	}
	
	private ArrayList<LineVertexInfo> vertexInfo;

	public Line() {
		vertexInfo = new ArrayList<>();
	}
	
	public Line(Line l) {
		vertexInfo = new ArrayList<>();
		if(l.withTexture)
			for (LineVertexInfo forCopy : l.vertexInfo)
				add(forCopy.vertex,forCopy.vTexture);
		else
			for (LineVertexInfo forCopy : l.vertexInfo)
				add(forCopy.vertex);
		
	}
	
	public void add(Vertex v, VTexture vt) throws LineNotHomogeneityException {
		if(vertexInfo.size()>0)
			if(!withTexture)
				throw new LineNotHomogeneityException();
		vertexInfo.add(new LineVertexInfo(v, vt));
		withTexture = true;
	}
	
	public void add(Vertex v) throws LineNotHomogeneityException {
		if(withTexture)
			throw new LineNotHomogeneityException();
		vertexInfo.add(new LineVertexInfo(v));
	}

	@Override
	public String toString() {
		return "Line [withTexture=" + withTexture + ", vertexInfo="
				+ vertexInfo + "]";
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
