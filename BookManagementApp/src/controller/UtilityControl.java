package controller;

import modal.BRManage;

import java.util.ArrayList;

public class UtilityControl {
    public ArrayList<BRManage> UpdateBRmInfo(ArrayList<BRManage> list, BRManage brm) {
        boolean isUpdated = false;
        for (int i = 0; i < list.size(); i++) {
            BRManage b = list.get(i);
            if (b.getBook().getBookId() == brm.getBook().getBookId() && b.getReader().getReaderID() == brm.getReader().getReaderID())
            {
                list.set(i, brm); // cập nhật lại
                isUpdated = true;
                break;
            }
        }
        if (!isUpdated) {
            list.add(brm);
        }
        return list;
    }
    public ArrayList<BRManage> UpdateTotalBorrow(ArrayList<BRManage> list){
        for(int i = 0 ; i < list.size();i++){
            BRManage b = list.get(i);
            int count = 0;
            for (int j = 0; j <list.size() ; j++) {
                if(list.get(j).getReader().getReaderID() == b.getReader().getReaderID()){
                    count += list.get(j).getNumofBorrow();
                }
            }
            b.setTotal(count);
            list.set(i,b);
        }
        return list;
    }
    public ArrayList<BRManage> SortByName(ArrayList<BRManage> list){
        for(int i = 0 ; i < list.size();i++){
            for (int j = list.size()-1; j > i ; j--) {
                BRManage bj = list.get(j);
                BRManage bbj = list.get(j-1);
                String[] res1 = bj.getReader().getFullname().split(" ");
                String[] res2 = bbj.getReader().getFullname().split(" ");
                if(res1[res1.length-1].compareTo(res2[res2.length-1]) < 0){ // sau nhỏ hơn trước
                    list.set(j,bbj);
                    list.set(j-1,bj);
                }
            }
        }
        return list;
    }
    public ArrayList<BRManage> SortByTotalBorrow(ArrayList<BRManage> list){
        for(int i = 0 ; i < list.size();i++){
            for (int j = list.size()-1; j > i ; j--) {
                BRManage bj = list.get(j);
                BRManage bbj = list.get(j-1);
                if(bj.getTotal() > bbj.getTotal()){ // sau lớn hơn trước
                    list.set(j,bbj);
                    list.set(j-1,bj);
                }
            }
        }
        return list;
    }
    public ArrayList<BRManage> Find(ArrayList<BRManage> list, String key){
        ArrayList<BRManage> res = new ArrayList<>();
        String pattern = ".*" + key.toLowerCase() + ".*";
        for (int i = 0; i < list.size() ; i++) {
            BRManage b = list.get(i);
            if(b.getReader().getFullname().toLowerCase().matches(pattern)){
                res.add(b);
            }
        }
        return res;
    }
}
