package hello.upload.domain;

import lombok.Data;

import java.util.List;

@Data
public class Item {

    private Long id;
    private String itemName;
    private UploadFile attachFile; //첨부파일 - 따로 만들어 관리
    private List<UploadFile> imageFiles; //이미지 파일 여러개인 경우

}
