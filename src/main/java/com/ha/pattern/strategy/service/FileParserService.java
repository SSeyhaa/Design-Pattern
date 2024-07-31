package com.ha.pattern.strategy.service;

import com.ha.pattern.strategy.constant.FileTypeEnum;
import com.ha.pattern.strategy.strategy.FileParser;
import com.ha.pattern.strategy.strategy.FileParserFactory;
import java.io.File;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FileParserService {

  private final FileParserFactory fileParserFactory;

  public void parse(File file, FileTypeEnum fileType) {
    FileParser fileParser = fileParserFactory.get(fileType);
    fileParser.parse(file);
  }
}
