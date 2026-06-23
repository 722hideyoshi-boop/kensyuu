package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dto.UserSearchRequest;
import com.example.demo.entity.User;

/**
 * ユーザー情報 Service（テスト用）
 */
@Service
public class UserService {

    /**
     * ユーザー情報検索（動作確認用のダミーデータを返す状態にしています）
     */
    public User search(UserSearchRequest userSearchRequest) {
        // ❌ データベースへのアクセスを一時的にストップ
        // return userMapper.search(userSearchRequest);
        
        // ⭕ 代わりに、画面表示を確認するためのダミーデータをその場で1件作って返します
        User dummyUser = new User();
        dummyUser.setId(1L);
        dummyUser.setName("テスト太郎");
        dummyUser.setAddress("東京都新宿区");
        dummyUser.setPhone("090-1234-5678");
        
        return dummyUser;
    }
}