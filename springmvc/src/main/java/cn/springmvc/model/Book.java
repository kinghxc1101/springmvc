package cn.springmvc.model;

public class Book {
	private String fno;
	private String fname;
	private String fauthor;
	private double fprice;
	public String getFno() {
		return fno;
	}
	public void setFno(String fno) {
		this.fno = fno;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getFauthor() {
		return fauthor;
	}
	public void setFauthor(String fauthor) {
		this.fauthor = fauthor;
	}
	public double getFprice() {
		return fprice;
	}
	public void setFprice(double fprice) {
		this.fprice = fprice;
	}
	@Override
	public String toString() {
		return "Book [fno=" + fno + ", fname=" + fname + ", fauthor=" + fauthor + ", fprice=" + fprice + "]";
	}
}
