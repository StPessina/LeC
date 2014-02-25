package lec.graphelement;

import java.util.ArrayList;

import lec.exception.FaceNotHomogeneityException;
import lec.vertexInfo.VNormal;
import lec.vertexInfo.VTexture;
import lec.vertexInfo.Vertex;

public class Face extends GraphElement {
	boolean withTexture = false;
	boolean withNormal = false;
	
	private class FaceVertexInfo {
		Vertex vertex;
		VTexture vTexture;
		VNormal vNormal;
		
		public FaceVertexInfo(Vertex vertex, VTexture vTexture, VNormal vNormal) {
			super();
			this.vertex = new Vertex(vertex);
			this.vTexture = new VTexture(vTexture);
			this.vNormal = new VNormal(vNormal);
		}
		
		public FaceVertexInfo(Vertex vertex, VTexture vTexture) {
			super();
			this.vertex = new Vertex(vertex);
			this.vTexture = new VTexture(vTexture);
		}
		
		public FaceVertexInfo(Vertex vertex) {
			super();
			this.vertex = new Vertex(vertex);
		}
		
	}
	
	private ArrayList<FaceVertexInfo> vertexInfo;
	
	public Face() {
		vertexInfo = new ArrayList<>();
	}
	
	public Face(Face f) {
		vertexInfo = new ArrayList<>();
		if(f.withTexture && f.withNormal) {
			for (FaceVertexInfo forCopy : f.vertexInfo)
				add(forCopy.vertex, forCopy.vTexture, forCopy.vNormal);
			withTexture = true;
			withNormal = true;
		}
		
		if(f.withTexture && !f.withNormal) {
			for (FaceVertexInfo forCopy : f.vertexInfo)
				add(forCopy.vertex, forCopy.vTexture);
			withTexture = true;
		}
		if(!f.withTexture && !f.withNormal)
			for (FaceVertexInfo forCopy : f.vertexInfo)
				add(forCopy.vertex);	
	}
	
	public void add(Vertex vertex) throws FaceNotHomogeneityException {
		if(withTexture || withNormal)
			throw new FaceNotHomogeneityException();
		vertexInfo.add(new FaceVertexInfo(vertex));
	}
	
	public void add(Vertex vertex, VTexture vTexture)  throws FaceNotHomogeneityException {
		if(vertexInfo.size()>0)	
			if(!(withTexture && !withNormal))
				throw new FaceNotHomogeneityException();
		vertexInfo.add(new FaceVertexInfo(vertex, vTexture));
		withTexture = true;
	}
	
	public void add(Vertex vertex, VTexture vTexture, VNormal vNormal)  throws FaceNotHomogeneityException {
		if(vertexInfo.size()>0)	
			if(!withTexture || !withNormal)
				throw new FaceNotHomogeneityException();
		vertexInfo.add(new FaceVertexInfo(vertex));
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
