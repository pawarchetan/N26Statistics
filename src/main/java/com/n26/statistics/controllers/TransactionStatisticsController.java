package com.n26.statistics.controllers;

import com.n26.statistics.domains.TransactionStatistic;
import com.n26.statistics.services.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/n26api/statistics")
public class TransactionStatisticsController {
    @Autowired
    private final StatisticsService statisticsService;

    @Autowired
    public TransactionStatisticsController(StatisticsService statisticsService) {
        this.statisticsService = statisticsService;
    }

    @GetMapping(produces = "application/json")
    public TransactionStatistic getTransactionStatistics() {
        return statisticsService.getTransactionStatistics();
    }
}

