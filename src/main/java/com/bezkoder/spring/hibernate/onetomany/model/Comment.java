package com.bezkoder.spring.hibernate.onetomany.model;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import javax.validation.constraints.NotBlank; // Importar NotBlank en lugar de NotNull
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "comments")
public class Comment {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "comment_generator")
  private Long id;

  @Lob
  @NotBlank(message = "El contenido no puede ser vacío") // Cambiar a NotBlank para validar que el campo no sea null o vacío
  private String content;

//  @ManyToOne(fetch = FetchType.EAGER, optional = false)
  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "tutorial_id", nullable = false)
  @OnDelete(action = OnDeleteAction.CASCADE)
  @JsonIgnore
  private Tutorial tutorial;

  public Long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Tutorial getTutorial() {
    return tutorial;
  }

  public void setTutorial(Tutorial tutorial) {
    this.tutorial = tutorial;
  }
}
```

Nota: Se importó `javax.validation.constraints.NotBlank` en lugar de `org.hibernate.validator.constraints.NotNull`. La anotación `@NotBlank` se utiliza para validar que el campo no sea null o vacío.