package entity;

public class Pagination {
    private int pageSize = 2;
    private int pageNum = 1;
    private int count = 0;

    public Pagination() {
    }

    /**
     *
     * @param pageSize 当前页码：从一开始
     * @param pageNum 每页的记录数
     * @param count 记录总数
     */
    public Pagination(int pageSize, int pageNum, int count) {
        this.pageSize = pageSize;
        this.pageNum = pageNum;
        this.count = count;
    }

    /**
     * 得到第一页
     */
    public int getFirst(){
        return 1;
    }


    /**
     * 总页数
     * @return
     */
    public int getPageCount(){
        return (int) Math.ceil(this.count*1/this.pageSize);
    }

    /**
     * 最后一页等于总页数
     * @return
     */
    public int getLast(){
        return getPageCount();
    }

    /**
     * 上一页等于当前页数减一，一直减到第一页
     * @return
     */
    public int getPrev(){
        return Math.max(this.pageNum-1,1);
    }

    /**
     * 下一页等于当前页数减加一，一直加到最后一页
     * @return
     */
    public int getNext(){
        return Math.min(this.pageNum+1,getPageCount());
    }
}
