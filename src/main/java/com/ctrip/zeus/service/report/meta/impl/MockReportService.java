package com.ctrip.zeus.service.report.meta.impl;

import com.ctrip.zeus.model.entity.Group;
import com.ctrip.zeus.model.entity.VirtualServer;
import com.ctrip.zeus.report.entity.ReportFeed;
import com.ctrip.zeus.report.entity.ReportGroup;
import com.ctrip.zeus.service.report.meta.ReportService;
import com.ctrip.zeus.service.report.meta.ReportTopic;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by zhoumy on 2015/7/9.
 */
@Component("mockReportService")
public class MockReportService implements ReportService {

    @Override
    public void reportMetaDataAction(Long targetId, ReportTopic reportTopic) throws Exception {

    }

    @Override
    public void reportMetaDataAction(Object target, ReportTopic reportTopic) {

    }

    @Override
    public List<ReportGroup> listErrors() throws Exception {
        return null;
    }

    @Override
    public List<ReportFeed> listFeeds() throws Exception {
        return null;
    }

    @Override
    public ReportGroup getReportGroupById(Long groupId) throws Exception {
        return null;
    }
}
