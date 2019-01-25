package com.stackroute.Muzix.domain;


import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

@Document(value = "tracks")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder


//no need of getter,setter,constructor or include @Data(combination of all these)//

public class Track
{
      @Id
      //@GeneratedValue(strategy = GenerationType.AUTO)
      @ApiModelProperty(notes = "The database generated track ID")
      private  int id;
      @ApiModelProperty(notes = "The name of the track", required = true)
      private String name;
      @ApiModelProperty(notes = "Please comment about the track")
      private String comment;

      public Track(String name, String comment) {
            this.name = name;
            this.comment = comment;
      }
}
