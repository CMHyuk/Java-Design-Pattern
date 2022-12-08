package template.pratice;

import java.util.List;

public class SimpleReportGenerator extends ReportGenerator {

    @Override
    protected boolean customerReportCondition(Customer customer) {
        return true;
    }

    @Override
    protected String getReportHeader(List<Customer> customers) {
        return String.format("고객 수: %d명\n", customers.size());
    }

    @Override
    protected String getReportForCustomer(Customer customer) {
        return String.format("%s: %d\n", customer.getName(), customer.getPoint());
    }

    @Override
    protected String getReportFooter(List<Customer> customers) {
        return "";
    }
}
