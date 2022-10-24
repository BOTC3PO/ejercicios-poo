package list;

public class Productos {
private int doc;
private String dom;

public Productos(int doc, String dom) {
	this.doc = doc;
	this.dom = dom;
}
public int getDoc() {
	return doc;
}
public void setDoc(int doc) {
	this.doc = doc;
}
public String getDom() {
	return dom;
}
public void setDom(String dom) {
	this.dom = dom;
}
@Override
public String toString() {
	return "Productos [doc=" + doc + ", dom=" + dom + "]";
}

}
