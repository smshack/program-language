package lecture32;

public class NoticeClass {
	private String id = "";
	private String title ="";
	private String writer_id ="";
	private String content ="";
	private String regdate ="";
	private String hit ="";
	private String files="";
	
	
	public NoticeClass(String id, String title, String writer_id, String content, String regdate,String hit, String files) {
		// TODO Auto-generated constructor stub
		this.id =id ;
		this.title = title;
		this.writer_id = writer_id;
		this.content = content;
		this.regdate =regdate;
		this.hit = hit;
		this.files = files;
	}


	public String getId() {
		return id;
	}


	public String getTitle() {
		return title;
	}


	public String getWriter_id() {
		return writer_id;
	}


	public String getContent() {
		return content;
	}


	public String getRegdate() {
		return regdate;
	}


	public String getHit() {
		return hit;
	}


	public String getFiles() {
		return files;
	}


	@Override
	public String toString() {
		return "NoticeClass [id=" + id + ", title=" + title + ", writer_id=" + writer_id + ", content=" + content
				+ ", regdate=" + regdate + ", hit=" + hit + ", files=" + files + "]";
	}
	
	
}
