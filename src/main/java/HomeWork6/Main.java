package HomeWork6;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

    }

    static class ReportService {
        private Map<String, Report> reportMap;

        public ReportService(Map<String, Report> reportMap) {
            this.reportMap = reportMap;
        }

        public byte[] createReport(Document document, String reportType) {
            // reportType = {"pdf-1", "json", "xml", ...}
            throw new UnsupportedOperationException();
        }

    }

    static class Document {
        private long id;
        private String number;
        // ...
    }

    interface Report {
        byte[] createReport(Document document);
    }

    static class PdfReport implements Report {
        @Override
        public byte[] createReport(Document document) {
            return new byte[0];
        }
    }

    static class JsonReport implements Report {
        @Override
        public byte[] createReport(Document document) {
            return new byte[0];
        }
    }

    static class XmlReport implements Report{
        @Override
        public byte[] createReport(Document document) {
            return new byte[0];
        }
    }



}

