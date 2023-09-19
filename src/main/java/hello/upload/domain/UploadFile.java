package hello.upload.domain;

import lombok.Data;

// 업로드 된 파일 정보 보관
@Data
public class UploadFile {

    private String uploadFileName; // 클라이언트에서 업로드 했을 때 파일명
    private String storeFileName; // 서버 내부에서 관리하는 파일명

    public UploadFile(String uploadFileName, String storeFileName) {
        this.uploadFileName = uploadFileName;
        this.storeFileName = storeFileName;
    }
}
