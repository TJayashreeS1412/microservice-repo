package com.stackroute.Muzix.domain;


import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

@Document(value = "Users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder


//no need of getter,setter,constructor or include @Data(combination of all these)//

public class User
{
      @Id
      @GeneratedValue(strategy = GenerationType.AUTO)
      @ApiModelProperty(notes = "The database generated User ID")
      private  int id;
      @ApiModelProperty(notes = "The name of the User", required = true)
      private String name;
      @ApiModelProperty(notes = "Please comment about the User")
      private String comment;

      public User(String name, String comment) {
            this.name = name;
            this.comment = comment;
      }
}
