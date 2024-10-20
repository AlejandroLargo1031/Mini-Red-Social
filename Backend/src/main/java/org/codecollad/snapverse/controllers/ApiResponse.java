package org.codecollad.snapverse.controllers;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse<T> {

  private boolean success;
  private int status;
  private String message;
  private String token;
  private List<T> data;

  // Constructor sin token (para respuestas sin token)
  public ApiResponse(boolean success, int status, String message) {
    this.success = success;
    this.status = status;
    this.message = message;
  }

  // Constructor con token (para respuestas que incluyan un token)
  public ApiResponse(boolean success, int status, String message, List<T> data) {
    this.success = success;
    this.status = status;
    this.message = message;
    this.data = data;
  }

}