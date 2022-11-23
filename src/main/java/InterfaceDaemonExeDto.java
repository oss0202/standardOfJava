import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@ToString
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class InterfaceDaemonExeDto {
    //자동화센터코드
    private String automtCntrCd;

    //인터페이스ID
    private String ifId;

    //호출API
    private String invkApi;

    //메인API여부
    private String maiApiYn;

    //재처리여부
    private String repocYn;

    //호출대상(WMS,WCS)
    private String invkTgt;
}
