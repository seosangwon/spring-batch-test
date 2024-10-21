package com.example.springbatchtest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.batch.test.context.SpringBatchTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@SpringBootTest
@SpringBatchTest
public class BatchTest {

    @Autowired
    private JobLauncherTestUtils helloJobLauncherTestUtils;
    @Autowired
    private JobLauncherTestUtils hello2JobLauncherTestUtils;
    @Autowired
    private JobLauncherTestUtils hello3JobLauncherTestUtils;
    @Autowired
    private JobLauncherTestUtils hello4JobLauncherTestUtils;
    @Autowired
    private JobLauncherTestUtils hello5JobLauncherTestUtils;

    @DisplayName("t1")
    @Test
    void t1() throws Exception {
        helloJobLauncherTestUtils.launchJob();
    }

    @DisplayName("t2")
    @Test
    void t2() throws Exception {
        hello2JobLauncherTestUtils.launchJob();
    }

    @DisplayName("t3")
    @Test
    void t3() throws Exception {
        hello3JobLauncherTestUtils.launchJob();
    }

    @DisplayName("t4")
    @Test
    void t4() throws Exception {
        hello4JobLauncherTestUtils.launchJob();
    }

    @DisplayName("t5")
    @Test
    void t5() throws Exception {
        hello5JobLauncherTestUtils.launchJob();
    }

}
