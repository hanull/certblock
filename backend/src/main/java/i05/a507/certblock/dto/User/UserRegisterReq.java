package i05.a507.certblock.dto.User;

import lombok.Getter;

import java.util.Date;

@Getter
public class UserRegisterReq {
    String name;
    String phone;
    String email;
    String pass;
    Date birth;
    int type;
}