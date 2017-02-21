package com.dlfc.zfgj.convertor;


import com.dlfc.zfgj.dto.base.ListResultDTO;
import com.dlfc.zfgj.dto.base.ResultDTO;
import com.dlfc.zfgj.exception.CustomRuntimeException;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Model与DTO转换类
 */
public abstract class AbstractConvertor<ENTITY, DTO> {

    /**
     * 将 DTO 转换为 Model.
     *
     * @param dto 数据传输对象
     * @return
     */
    public abstract ENTITY toModel(final DTO dto) throws CustomRuntimeException;

    /**
     * 将 Model 转换为 DTO.
     *
     * @param model 数据Model
     * @return
     */
    public DTO toDTO(final ENTITY model) {
        return this.toDTO(model, false);
    }

    /**
     * 将 Model 转换为 DTO.
     *
     * @param model 数据Model
     * @param forListView 是否为列表视图做转换 true：列表视图 false：详细视图
     * @return
     */
    public abstract DTO toDTO(final ENTITY model, boolean forListView);

    public final List<ENTITY> toListModel(final List<DTO> dtoList) {
        final List<ENTITY> modelList = dtoList.stream().map(dto -> this.toModel(dto)).collect(Collectors.toList());
        return modelList;
    }

    public final List<DTO> toListDTO(final List<ENTITY> modelList) {
        final List<DTO> dtoList = modelList.stream().map(model -> this.toDTO(model, true)).collect(Collectors.toList());
        return dtoList;
    }

    public final ResultDTO<DTO> toResultDTO(final ENTITY model) {
        final DTO dto = (model == null) ? null : this.toDTO(model);
        final ResultDTO<DTO> resultDTO = ResultDTO.success(dto);
        return resultDTO;
    }

    public final ListResultDTO<DTO> toResultDTO(final List<ENTITY> modelList) throws CustomRuntimeException {
        final List<DTO> dtoList = this.toListDTO(modelList);
        final ListResultDTO<DTO> resultDTO = ListResultDTO.success(dtoList);
        return resultDTO;
    }
}