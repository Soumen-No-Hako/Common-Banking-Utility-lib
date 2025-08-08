package artim.nemuos.banking.lib.common.BasicReqResp;

public class BasicTransaction {
    String transactionId, srcAccntId, destAccntId, transactionStatus;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getSrcAccntId() {
        return srcAccntId;
    }

    public void setSrcAccntId(String srcAccntId) {
        this.srcAccntId = srcAccntId;
    }

    public String getDestAccntId() {
        return destAccntId;
    }

    public void setDestAccntId(String destAccntId) {
        this.destAccntId = destAccntId;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public BasicTransaction(String transactionId, String srcAccntId, String destAccntId, String transactionStatus) {
        this.transactionId = transactionId;
        this.srcAccntId = srcAccntId;
        this.destAccntId = destAccntId;
        this.transactionStatus = transactionStatus;
    }

    public BasicTransaction() {
    }
}
