package template.pratice;

import java.util.List;

public class ComplexReportGenerator extends ReportGenerator {
    @Override
    protected boolean customerReportCondition(Customer customer) {
        return customer.getPoint() >= 100;
    }

    @Override
    protected String getReportHeader(List<Customer> customers) {
        return String.format("고객 수: %d명입니다\n", customers.size());
    }

    @Override
    protected String getReportForCustomer(Customer customer) {
        return String.format("%d: %s\n", customer.getPoint(), customer.getName());
    }

    @Override
    protected String getReportFooter(List<Customer> customers) {
        int totalPoint = 0;

        for (Customer customer : customers) {
            totalPoint += customer.getPoint();
        }
        return String.format("점수 합계: %d", totalPoint);
    }
}
