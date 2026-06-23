package com.example.demo.dto;

import java.io.Serializable;

/**
 * ユーザー情報 検索用リクエストデータ
 */
public class UserSearchRequest implements Serializable {

  /** ユーザーID */
  private Long id;

  public Long getId() { return id; }
  public void setId(Long id) { this.id = id; }
}