package io.metersphere.api.dto.definition;

import io.metersphere.base.domain.ApiDefinitionWithBLOBs;
import io.metersphere.base.domain.ApiTestCaseWithBLOBs;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ApiExportResult {
    private String projectName;
    private String protocol;
    private List<ApiDefinitionWithBLOBs> data;
    private List<ApiTestCaseWithBLOBs> cases;
}
