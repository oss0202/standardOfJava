import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author : 221213
 * @date : 2022. 12. 07
 */
@ToString
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShppSbCelMpng implements Cloneable {
	private String automtCntrCd;//자동화센터코드
	private String sbCelBarcd;//SB셀바코드
	private String taskTypeDtlCd;//업무유형상세코드: W053
	private String sbEqpmnLineNo;//SB설비라인번호
	private String sbCelEqpmnPstCd;//SB셀설비위치코드: WC027
	private String sbLineEqpmnPstCd;//SB라인설비위치코드: WC027
	private String sbInptOrdr;//SB투입순서
	private String spltId;//스플리터ID
	private String sbAssgNo;//SB할당번호
	private String shppNo;//배송번호
	private String shppBoxSeq;//배송박스순번
	private String sbWhinCmplYn;//SB입고완료여부
	private String regpeId;//등록자ID
	private String regDts;//등록일시
	private String modpeId;//수정자ID
	private String modDts;//수정일시

	@Override public ShppSbCelMpng clone() {
		try {
			ShppSbCelMpng clone = (ShppSbCelMpng) super.clone();
			return clone;
		} catch (CloneNotSupportedException e) {
			throw new AssertionError();
		}
	}
}
