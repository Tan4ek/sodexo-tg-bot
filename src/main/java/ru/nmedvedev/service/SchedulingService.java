package ru.nmedvedev.service;

import io.quarkus.scheduler.Scheduled;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.enterprise.context.ApplicationScoped;
import java.time.Duration;
import java.time.OffsetDateTime;

@Slf4j
@ApplicationScoped
@RequiredArgsConstructor
public class SchedulingService {

    private final BalanceChangeChecker checker;

    @Scheduled(every = "{scheduling.every}")
    void checkBalanceChange() {
        checker.check();
    }

}
