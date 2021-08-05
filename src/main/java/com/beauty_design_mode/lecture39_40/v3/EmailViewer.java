package com.beauty_design_mode.lecture39_40.v3;

import com.beauty_design_mode.lecture39_40.support.EmailSender;
import com.beauty_design_mode.lecture39_40.v3.model.RequestStat;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Alan Yin
 * @date 2020/10/19
 */

public class EmailViewer implements StatViewer {

    private EmailSender emailSender;

    private List<String> toAddresses = new ArrayList<>();

    public EmailViewer() {
        this.emailSender = new EmailSender();
    }

    public EmailViewer(List<String> toAddresses) {
        this.toAddresses = toAddresses;
    }

    public EmailViewer(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void addAddress(String address) {
        toAddresses.add(address);
    }

    @Override
    public void output(Map<String, RequestStat> requestStats, long startTimeInMills, long endTimeInMills) {
        // format the requestStats to HTML style.
        // send it to email toAddresses.
    }
}
