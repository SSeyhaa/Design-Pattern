package com.ha.pattern.strategy.strategy;

import com.ha.pattern.strategy.constant.FileTypeEnum;
import java.io.File;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class XmlFileParser implements FileParser {

  @Override
  public FileTypeEnum getFileType() {
    return FileTypeEnum.XML;
  }

  @Override
  public void parse(File file) {
    log.info("----- XML file parsing...");
  }
}
