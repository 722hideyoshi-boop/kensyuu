package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.UserSearchRequest;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

/**
 * ユーザー情報 Controller
 */
@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * ユーザー情報 Service
     */
    @Autowired
    private UserService userService;

    /**
     * ユーザー情報検索画面を表示
     */
    @GetMapping("/search")
    public String displaySearch(Model model) {
        // ⭕ HTML側（th:object）が求めている「空っぽの箱」をここで確実に渡してあげます
        model.addAttribute("userSearchRequest", new UserSearchRequest());
        // templates/user/search.html を呼び出す（フォルダ構成に合わせて適宜変更してください）
        return "user/search"; 
    }

    /**
     * ユーザー情報検索を実行
     */
    @PostMapping("/id_search")
    public String search(@ModelAttribute UserSearchRequest userSearchRequest, Model model) {
        // Serviceからダミーデータを取得（先ほど修正したテストデータが返ります）
        User user = userService.search(userSearchRequest);
        
        // ⭕ 検索結果（userinfo）と、入力された値を保持するための箱を両方画面に返します
        model.addAttribute("userinfo", user);
        model.addAttribute("userSearchRequest", userSearchRequest);
        
        return "user/search";
    }
}