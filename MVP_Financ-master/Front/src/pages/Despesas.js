import React from 'react';


import styled from 'styled-components';
import DataTable from '../components/DataTable';
import DonutChart from '../components/DonutChart';
import Navbar from '../components/Navbar';

const Container = styled.div`

  width: 100%;
  height: 100%;
  background: #f0f0f7;
  padding: 0 5% 10px 5%;

  div.content {
    width: 100%;
    display: flex;
    justify-content: space-between;
    margin: 50px 0;

    div.media{
      width: 40%;
      background: #FFFFFF;
      border-radius: 20px;
      box-shadow: 0 1px 4px 0 rgba(0,0,0,.4);
    }

    div.grafico {
      width: 57%;
      background: #FFFFFF;
      border-radius: 20px;
      box-shadow: 0 1px 4px 0 rgba(0,0,0,.4);
    }
  }

`;

const DataOptions = styled.div`

  width: 100%;
  display: flex;
  justify-content: space-between;
  padding: 0 20px;
`;

function pages() {
  return (
      <>  
        <Navbar />
          <Container>
            <div className="content">
              <div className="media">
                <h1>Média mensal<br/>
                    R$ 1250,00
                </h1>
              </div>
              <div className="grafico">
                <DonutChart />
              </div>
            </div>
            <DataOptions>
              {/* <Button setShow={setShow} texto={"Nova transação"} />
              <Button texto={"26/06/2021"} /> */}
            </DataOptions>
            <DataTable />
          </Container>
      </>
  );
}

export default pages;