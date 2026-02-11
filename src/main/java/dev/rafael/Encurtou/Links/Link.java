package dev.rafael.Encurtou.Links;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Links_encurtados")
public class Link {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)

	private Long id;
	private String urlOriginal;
	private String urlEncurtada;
	private LocalDateTime urlCriadaEm;

	public Link(LocalDateTime urlCriadaEm, String urlEncurtada, String urlOriginal, Long id) {
		this.urlCriadaEm = urlCriadaEm;
		this.urlEncurtada = urlEncurtada;
		this.urlOriginal = urlOriginal;
		this.id = id;
	}

	public Link() {

	}

	public String getUrlEncurtada() {
		return urlEncurtada;
	}

	public void setUrlEncurtada(String urlEncurtada) {
		this.urlEncurtada = urlEncurtada;
	}

	public LocalDateTime getUrlCridaEm() {
		return urlCriadaEm;
	}

	public void setUrlCridaEm(LocalDateTime urlCridaEm) {
		this.urlCriadaEm = urlCridaEm;
	}

	public String getUrlOriginal() {
		return urlOriginal;
	}

	public void setUrlOriginal(String urlOriginal) {
		this.urlOriginal = urlOriginal;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
