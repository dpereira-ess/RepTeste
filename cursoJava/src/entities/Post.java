package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	
	private List<Coment> coments = new ArrayList<>();

	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	
	public Post() {
	}



	public Date getMoment() {
			return moment;
		}



		public void setMoment(Date moment) {
			this.moment = moment;
		}



		public String getTitle() {
			return title;
		}



		public void setTitle(String title) {
			this.title = title;
		}



		public String getContent() {
			return content;
		}



		public void setContent(String content) {
			this.content = content;
		}



		public Integer getLikes() {
			return likes;
		}



		public void setLikes(Integer likes) {
			this.likes = likes;
		}

		public void addComent(Coment coment){
			coments.add(coment);
		}
		
		public void removeComent(Coment coment){
			coments.remove(coment);
		}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes + " Likes - ");
		sb.append(sdf.format(moment) + "\n");
		sb.append(content + "\n");
		sb.append("Coments:\n");
		
		for (Coment obj : coments) {
			sb.append(obj.getText() + "\n");
		}
				
		return sb.toString();
	}
	
}
