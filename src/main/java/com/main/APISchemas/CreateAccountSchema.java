package com.main.APISchemas;

import com.main.Notification.model.NotificationChannels;
import com.main.UserAccount.model.UserAccount;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class CreateAccountSchema {
    private String name;
    private String email;
    private String password;
    private String address ;
    private String phone;
    private double balance;

    private NotificationChannels channel;




    public double getBalance(){
        return this.balance;
    }



    public void setBalance(double balance){
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public NotificationChannels getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = NotificationChannels.valueOf(channel.toUpperCase());
    }
}
